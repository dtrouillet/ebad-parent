package fr.trouillet.faya.ebad.parent.dto;

import lombok.Data;

@Data
public class AgentInfos {
    private String name;
    private String host;
    private String[] applications;
    private String environment;
}
