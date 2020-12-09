package io.pivotal.pal.tracker;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TimeEntryRepository {
    TimeEntry create(TimeEntry timeEntry);
    TimeEntry find(Long id);
    List<TimeEntry> list();
    TimeEntry update(Long id, TimeEntry timeEntry);
    void delete(Long id);
}
