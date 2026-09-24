package com.bep4.shared.member.event;

import com.bep4.shared.member.dto.MemberDto;
import com.bep4.standard.event.HasEventName;

public record MemberJoinedEvent(
        MemberDto member
) implements HasEventName {
}