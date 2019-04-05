package net.nomad.inpia.cv03.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class issueReportRepositoryTest {
    @Autowired
    IssueRepository issueRepository;

    @Test
    public void testSave() {
        IssueReport report = new IssueReport();
        report.setDescription("test");
        report.setUrl("url");
        issueRepository.save(report);

        Long id = report.getId();
        assertNotNull(id);

        Optional<IssueReport> fromDb = issueRepository.findById(id);
        assertEquals(fromDb.get().getDescription(), "test");
    }
}