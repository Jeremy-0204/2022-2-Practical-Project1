package com.mycom.word;

// 함수 선언해주는 인터페이스 입니다.
public interface ICRUD {
    public Object add();
    public int update(Object obj);
    public int delete(Object obj);
    public void selectOne(int id);
}
