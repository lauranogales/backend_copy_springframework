package com.example.demoo.Controllers;
import com.example.demoo.Entities.Doctor;
import com.example.demoo.Repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Doctor")
public class DoctorController {
    @Autowired
    DoctorRepository doctorRepository;
    @RequestMapping("/Doctor/{id}")
    public String Doctor(@PathVariable Long id, Model model){
        model.addAttribute("Doctor",doctorRepository.findById(id));
        return "Doctor";
    }
    @RequestMapping(value="/Doctors",method= RequestMethod.GET)
    public String DoctorsList(Model model) {
        model.addAttribute("Doctors", doctorRepository.findAll());
        return "Doctors";}
    @RequestMapping(value="/Doctors",method=RequestMethod.POST)
    public String DoctorsAdd(@RequestParam String name,
                             @RequestParam String hospital, @RequestParam Long id, Model model) {
        Doctor newDoctor = new Doctor(name,hospital,id);
        newDoctor.setName(name);
        newDoctor.setHospital(hospital);
        doctorRepository.save(newDoctor);

        model.addAttribute("Doctor", newDoctor);
        return "redirect:/Doctor/" + newDoctor.getId();

    }}