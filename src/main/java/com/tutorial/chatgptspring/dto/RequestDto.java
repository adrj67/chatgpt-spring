/*
 * https://www.baeldung.com/spring-boot-chatgpt-api-openai
 * 3.2 DTOs 
 */
package com.tutorial.chatgptspring.dto;

import java.util.ArrayList;
import org.apache.logging.log4j.message.Message;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author adrj
 */
@NoArgsConstructor
@Data
public class RequestDto {
    
    private String model;
    private List<MessageDto> messages;

    public RequestDto(String model, String prompt) {
        this.model = model;
        messages = new ArrayList<>();
        messages.add(new MessageDto("user", prompt));
    }
    
    
    
}
