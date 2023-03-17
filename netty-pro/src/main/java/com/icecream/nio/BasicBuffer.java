package com.icecream.nio;

import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class BasicBuffer {
    public static void main(String[] args) {
        IntBuffer intBuffer = IntBuffer.allocate(4);

        CharBuffer charBuffer = CharBuffer.allocate(4);
    }
}
