package dev.java10x.EventClean.core.usecases;

import dev.java10x.EventClean.core.entities.Event;

public interface SearchEventCase {
    public Event execute(Long id);
}
