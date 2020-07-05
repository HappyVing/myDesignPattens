package com.ving.mydesignpattens.adapter;

public class MyAdapter {

    public static void main(String[] args) {
        System.out.println(new Adapter(new Speaker()).translate());
    }

    static class Speaker {
        public String speak() {
            return "ving is good man~";
        }
    }

    interface Translator {
        String translate();
    }

    // 适配器
    // 例子：新闻联播上，主持人下方有一个专门聋哑人收看的盲文手势。从聋哑人的角度，听不到主持人的话，只能看盲文手势。

    static class Adapter implements Translator {
        Speaker speaker;

        public Adapter(Speaker speaker) {
            this.speaker = speaker;
        }

        // 目的是让用户，不需要调用到Speak的speak方法
        @Override
        public String translate() {

            return "被转换化的内容：tom is good man ";
        }
    }
}
