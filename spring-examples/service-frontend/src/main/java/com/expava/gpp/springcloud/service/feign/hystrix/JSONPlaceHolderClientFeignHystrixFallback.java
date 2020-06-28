package com.expava.gpp.springcloud.service.feign.hystrix;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.expava.gpp.springcloud.model.Post;

@Component
public class JSONPlaceHolderClientFeignHystrixFallback implements JSONPlaceHolderClientFeignHystrix {
	
	@Override
    public List<Post> getPosts() {
        return Collections.emptyList();
    }
 
    @Override
    public Post getPostById(Long postId) {
        return null;
    }
}
