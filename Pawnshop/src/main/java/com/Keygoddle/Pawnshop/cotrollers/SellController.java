package com.Keygoddle.Pawnshop.cotrollers;
import com.Keygoddle.Pawnshop.models.Post;
import com.Keygoddle.Pawnshop.repo.PostReprository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SellController {

    @Autowired
    private PostReprository postRepository;


    @GetMapping ("/buy-main")
    public String buyMain (Model model){
        Iterable<Post> posts=postRepository.findAll();
        model.addAttribute("posts",posts);
        return "buy-main";
    }
}

