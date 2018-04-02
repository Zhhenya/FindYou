package com.find.demo;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Controller
public class ParseFile {

   /* @RequestMapping(value = "/person", method = RequestMethod.POST)
    public String getDate(@ModelAttribute Person onePerson, Model model){
        model.addAttribute("onePerson", onePerson);
        return "find";
    }*/
    private String name;
    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public String getDate( ModelMap model){
        model.addAttribute("name1", name);
        return "find";
    }

    @RequestMapping(value="/greeting", method=RequestMethod.POST)
    public String greetingSubmit(Model model) {
        model.addAttribute("name1", name);
        return "result";
    }

    /*   private Person onePerson = new Person();

   @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getDate(  ModelMap model){
     //b    model.addAttribute("person", person);
        return "find";
   }
*/

  /*
    public void parseFile(String file) throws IOException {
        HSSFWorkbook book = new HSSFWorkbook(new FileInputStream(file));
        HSSFSheet sheet = book.getSheet("Лист1");
        HSSFRow row = sheet.getRow(7);

    }*/

}
