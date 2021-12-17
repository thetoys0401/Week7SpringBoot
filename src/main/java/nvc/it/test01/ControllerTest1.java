package nvc.it.test01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerTest1 {
    @RequestMapping(value="/", method=RequestMethod.GET)
    @ResponseBody
        public String Hiran_63309010014(){
            return "<center>This root page <br> <a href='/name'>Go to Name page</a> <br><a href='/about'>Go to About page</a> <br> <a href='/contact'>Go to Contact page</a></center>";
            
        }
    @RequestMapping("/name")
    @ResponseBody
    public String name(){
        return "<center>Hiran Wongchai <br> <a href='/'>Go to Home page</a> </center>";
    }
    @RequestMapping("/about")
    @ResponseBody
    public String about(){
        return "<center>F.Name: Hiran <br> L.Name: Wongchai <br> Call: 062-382-5945 <br> Age: 19 Years old<br> <a href='/'>Go to Home page</a> </center>";
    }
    @RequestMapping("/contact")
    @ResponseBody
    public String contact(){
        return"<center>Phone: 0623-382-5945 <br> Facebook: ทอย <br> Line: the_toys <br> <a href='/'>Go to Home page</a> </center>";
    }

}
