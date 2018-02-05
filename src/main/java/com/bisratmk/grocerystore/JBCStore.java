package com.bisratmk.grocerystore;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.validation.Valid;


@Controller
public class JBCStore {

    @Autowired
    CosmeticsRepository cosmeticsRepository;
    @Autowired
    CleaningitemsRepository cleaningitemsRepository;
    @Autowired
    SnacksRepository snacksRepository;

    @GetMapping("/GroceryStore")
    public String homePage() {
        return "grocerystore";
    }

    @GetMapping("/cosmo")
    public String cosmoForm(Model model){
        model.addAttribute("newcosmo", new Cosmetics());
        return "cosmo";
    }

    @PostMapping("/cosmo")
    public String cosmoProcess(@Valid @ModelAttribute("newcosmo") Cosmetics cosmetics, BindingResult result) {
        if (result.hasErrors()) {
            return "cosmo";
        }
        cosmeticsRepository.save(cosmetics);

        return "cosmoshow";
    }

    @GetMapping("/ci")
    public String cleaningiForm(Model model){
        model.addAttribute("newci", new CleaningItems());
        return "ci";
    }

    @PostMapping("/ci")
    public String cleaningiProcess(@Valid @ModelAttribute("newci") CleaningItems cleaningi, BindingResult result) {
        if (result.hasErrors()) {
            return "ci";
        }
        cleaningitemsRepository.save(cleaningi);

        return "cishow";
    }

    @GetMapping("/snack")
    public String snackForm(Model model){
        model.addAttribute("newsnack", new Snacks());
        return "snack";
    }

    @PostMapping("/snack")
    public String snackProcess(@Valid @ModelAttribute("newsnack") Snacks snacks, BindingResult result) {
        if (result.hasErrors()) {
            return "snack";
        }
        snacksRepository.save(snacks);

        return "snackshow";
    }

    @RequestMapping("/showall")
    public String showForm(){

        return "showall";
    }

    @PostMapping("/showall")
    public String postForm(){

        return "showall";
    }


}
