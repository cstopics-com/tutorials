package com.expava.gpp.springcloud.service.feign.hystrix;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expava.gpp.springcloud.model.Post;

@Service
public class JSONPlaceHolderServiceFeignHystrix {

	@Autowired
    private JSONPlaceHolderClientFeignHystrix jsonPlaceHolderClientFeignHystrix;

    public List<Post> getPosts() {
        return jsonPlaceHolderClientFeignHystrix.getPosts();
    }

    public Post getPostById(Long id) {
        return jsonPlaceHolderClientFeignHystrix.getPostById(id);
    }
}
