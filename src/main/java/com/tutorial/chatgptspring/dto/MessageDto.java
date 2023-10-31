/*
 * https://www.baeldung.com/spring-boot-chatgpt-api-openai
 * 3.2 DTOs 
 */
package com.tutorial.chatgptspring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author adrj
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MessageDto {
    
    private String role;
    private String content;
    
}
