package com.luangeng.bootweb.service.impl;

/**
 * @author tangj
 * @date 2018/5/12 19:57
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class RedisServiceTest {
//    @Autowired
//    private RedisTemplate redisTemplate;
//
//    @Autowired
//    private ValueOperations<String,Object> valueOperations;
//
//    @Autowired
//    private TemplateEngine templateEngine;
//
//    @Autowired
//    private IContentService contentService;
//
//    @Autowired
//    private ICommentService commentService;
//
//    @Autowired
//    private IMetaService metaService;
//
//    @Test
//    public void test(){
//        Context context = new Context();
//        PageInfo<ContentVo> articles = contentService.getContents(1, 10);
//        List<MetaVo> categories = metaService.getMetaList(Types.CATEGORY.getType(), null, WebConst.MAX_POSTS);
//        context.setVariable("categories", categories);
//        context.setVariable("articles", articles);
//        String html = templateEngine.process("themes/simple/index",context);
//        System.out.println(html);
//    }
//}