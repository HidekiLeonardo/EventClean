package dev.java10x.EventClean.core.entities;

import dev.java10x.EventClean.core.enums.EventType;

import java.time.LocalDateTime;

public record Event(Long id,
                    String nome,
                    String descricao,
                    String identificador,
                    LocalDateTime inicio,
                    LocalDateTime fim,
                    String local,
                    String organizador,
                    Long capacidade,
                    EventType tipo) {
}
