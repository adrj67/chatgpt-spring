/*
 * https://www.youtube.com/watch?v=cTGJwX6O2BY&list=PL4bT56Uw3S4wwT5MJy_Z5ysHKncx-ZK2M&index=2
 * 8:02 / 22:40
 */
package com.tutorial.chatgptspring.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseDto {
    
    private List<Choice> choices;
    
    @Data
    public static class Choice {

        private MessageDto message;
        private int index;
        
    } 
    
}
