package cn.tf.lessontype.service;


import cn.tf.lessontype.domain.CrmLessontype;
import cn.tf.page.bean.PageBean;

public interface  LessontypeService {
	
	PageBean<CrmLessontype>  findAllPage(int pageNum,int pageSize);

}