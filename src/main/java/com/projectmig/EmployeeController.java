package com.projectmig;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by JavaDeveloperZone on 19-07-2017.
 */
@Controller
public class EmployeeController {


    @GetMapping("/")
    public String getForm() {
        return "employeeFrom";
    }

    @PostMapping("/saveDetails")                     // it only support port method
    public String saveDetails(@RequestParam("employeeName") String employeeName,
                              @RequestParam("employeeEmail") String employeeEmail,
                              @RequestParam("username") String username,
                              @RequestParam("address") String address,
                              @RequestParam("contact") String contact,
                              ModelMap modelMap) {

        // write your code to save details
        modelMap.put("employeeName", employeeName);
        modelMap.put("employeeEmail", employeeEmail);
        modelMap.put("username", username);
        modelMap.put("address", address);
        modelMap.put("contact", contact);
        return "viewDetails";           // welcome is view name. It will call employeeFrom.jsp
    }
}
