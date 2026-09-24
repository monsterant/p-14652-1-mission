
package com.bep4.infra.kafka;

import com.bep4.standard.event.HasEventName;

public record MyEvent(String msg) implements HasEventName {
}