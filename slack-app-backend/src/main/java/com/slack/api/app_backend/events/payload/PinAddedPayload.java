package com.slack.api.app_backend.events.payload;

import com.slack.api.model.event.PinAddedEvent;
import lombok.Data;

import java.util.List;

@Data
public class PinAddedPayload implements EventsApiPayload<PinAddedEvent> {

    private String token;
    private String enterpriseId;
    private String teamId;
    private String apiAppId;
    private String type;
    private List<String> authedUsers;
    private List<String> authedTeams;
    private List<Authorization> authorizations;
    private boolean isExtSharedChannel;
    private String eventId;
    private Integer eventTime;
    private String eventContext;

    private PinAddedEvent event;
}
