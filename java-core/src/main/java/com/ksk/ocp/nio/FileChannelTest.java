package com.ksk.ocp.nio;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelTest {
//    public static void main(String[] args) {
//        readFile();
//    }
//
//    private static <RandomAccessFile> void readFile() throws IOException {
//        try (RandomAccessFile reader = new RandomAccessFile("src/test/resources/test_read.in", "r");
//             FileChannel channel = reader.getChannel();
//             ByteArrayOutputStream out = new ByteArrayOutputStream()) {
//
//            int bufferSize = 1024;
//            if (bufferSize > channel.size()) {
//                bufferSize = (int) channel.size();
//            }
//            ByteBuffer buff = ByteBuffer.allocate(bufferSize);
//
//            while (channel.read(buff) > 0) {
//                out.write(buff.array(), 0, buff.position());
//                buff.clear();
//            }
//
//            String fileContent = new String(out.toByteArray(), StandardCharsets.UTF_8);
//
//            assertEquals("Hello world", fileContent);
//        }
//    }
}
