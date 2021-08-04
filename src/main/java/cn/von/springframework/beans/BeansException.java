package cn.von.springframework.beans;

/**
 * 博客：https://von.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：von虫洞栈
 * Create by 小傅哥(fustack)
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
