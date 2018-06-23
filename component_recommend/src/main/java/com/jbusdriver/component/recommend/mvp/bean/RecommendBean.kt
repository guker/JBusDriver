package com.jbusdriver.component.recommend.mvp.bean

data class RecommendBean(val name: String, val img: String, val url: String)
data class RecommendRespBean(val key: RecommendBean, val score: Int, val reason: String?)