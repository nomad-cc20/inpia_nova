package net.nomad.inpia.cv03.controller;

import net.nomad.inpia.cv03.dao.IssueReport;
import net.nomad.inpia.cv03.dao.IssueRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class IssueController {

    IssueRepository issueRepository;

    public IssueController(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    @GetMapping("/issuereport")
    public String getReport(Model model) {
        model.addAttribute("issueReport", new IssueReport());
        return "issues/issuereport_form";
    }

    @PostMapping("/issuereport")
    public String issueReportSubmit(@RequestAttribute("issueReport") IssueReport issueReport, Model model) {
        System.out.println("Submitted " + issueReport.getDescription());
        IssueReport result = this.issueRepository.save(issueReport);
        model.addAttribute("submitted", true);
        model.addAttribute("issueReport, result");
        return "redirect:/issuereport";
    }

    @GetMapping("/issues")
    public String getIssueReport(Model model) {
        model.addAttribute("issues", this.issueRepository.findAll());
        return "issues/issuereport_list";
    }

}
