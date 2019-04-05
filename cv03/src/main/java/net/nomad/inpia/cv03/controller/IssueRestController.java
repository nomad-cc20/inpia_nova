package net.nomad.inpia.cv03.controller;

import net.nomad.inpia.cv03.dao.IssueReport;
import net.nomad.inpia.cv03.dao.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/issues")
public class IssueRestController {

    @Autowired
    IssueRepository issueRepository;

    @GetMapping("/api/issu/list")
    public List<IssueReport> issues() {
        return issueRepository.findAll();
    }
}