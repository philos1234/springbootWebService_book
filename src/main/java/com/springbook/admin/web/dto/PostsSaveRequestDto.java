package com.springbook.admin.web.dto;

import com.springbook.admin.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


/**
 * Entity 클래스와 거의유사한 형태임에도 Dto 클래스를 추가로 생성한 이유는
 * 절대로 Entity 클래스를 Request/Response 클래스로 사용해서는 안되기 떄문임!
 */
@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author){
        this.title= title;
        this.content= content;
        this.author = author;
    }

    public Posts toEntity(){
        return Posts.builder().title(title).content(content).author(author).build();

    }
}
