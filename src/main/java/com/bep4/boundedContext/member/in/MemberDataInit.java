package com.bep4.boundedContext.member.in;

import com.bep4.global.eventPublisher.EventPublisher;
import com.bep4.shared.member.dto.MemberDto;
import com.bep4.shared.member.event.MemberJoinedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MemberDataInit {
    private final EventPublisher eventPublisher;

    @Bean
    public ApplicationRunner memberDataInitApplicationRunner() {
        return args -> {
            eventPublisher.publish(
                    new MemberJoinedEvent(
                            new MemberDto(1)
                    )
            );
        };
    }
}