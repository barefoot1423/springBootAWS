package com.hyunwoo.book.springboot.web;

import com.hyunwoo.book.springboot.service.posts.PostsService;
import com.hyunwoo.book.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostApiController {

    private final PostsService postsService;

    @PutMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto postsSaveRequestDto) {
        return postsService.save(postsSaveRequestDto);
    }
}
