package org.patterns.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EmailTopicSubscriber implements Observer {
    private Subject topic;
    private String name;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null) System.out.println(String.format("%s no new message.", name));
        else System.out.println(String.format("%s retrieving message: %s", name, msg));
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
