package de.tu_ilmenau.javase.IO.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*

拷贝目录：
	将D:\course拷贝到C盘根下....

	需要使用到：
		FileInputStream
		FileOutputStream
		File

	可能需要使用到递归。你尝试实现一下！

    注意！这个只能拷贝目录和目录下的文件，不适用于单个文件的拷贝

 */
public class FilesCopy {
    public static void main(String[] args) {
        //拷贝源和拷贝目标
        File start = new File("D:\\target\\");
        File end = new File("E:\\");
       /* String startPath = start.getAbsolutePath().substring(3);
        String endPath = end.getAbsolutePath().endsWith("\\") ?
                end.getAbsolutePath()  + startPath : end.getAbsolutePath() + "\\" + startPath;
        File endFile = new File(endPath);*/
       /* if(!endFile.exists()) endFile.mkdirs();*/

        //调用fileCopy方法拷贝
        try {
            fileCopy(start, end);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void fileCopy(File start, File end) throws Exception{

        if (start.isFile()) {
            //是文件的时候进行拷贝，一边读一边写
            FileInputStream in = null;
            FileOutputStream out = null;
            //找到对应的路径
            String path =  end.getAbsolutePath().endsWith("\\") ?
                    end.getAbsolutePath()+ start.getAbsolutePath().substring(3) :
                    end.getAbsolutePath() + "\\" + start.getAbsolutePath().substring(3);
            System.out.println(path);

            in = new FileInputStream(start);


            out = new FileOutputStream(path);


            byte[] bytes = new byte[1024 * 1024];
            int count = 0;
            while ((count = in.read(bytes)) != -1) {
                out.write(bytes, 0 ,count);
            }

            out.flush();
            in.close();
            out.close();
            return;
        }else { //这一步很关键！ 如果一开始给的不是一个文件，就要先在目标处新建一个目录才行
            String srcDir = start.getAbsolutePath();
            String destDir = end.getAbsolutePath().endsWith("\\") ?
                    end.getAbsolutePath()+ srcDir.substring(3) :
                    end.getAbsolutePath() + "\\" + srcDir.substring(3);
            File newFile = new File(destDir);
            if (!newFile.exists()) newFile.mkdirs();
        }

        //先获取源下面的子目录
        File[] files = start.listFiles();
        for (File file : files
             ) {
//            System.out.println(file.getAbsolutePath());
            //如果是一个路径，还要递归
           /* if (file.isDirectory()) {
                //截取盘符,把D:\\截掉
                String srcDir = file.getAbsolutePath();
//                System.out.println(srcDir.substring(3));
                String destDir = end.getAbsolutePath().endsWith("\\") ?
                        end.getAbsolutePath()+ srcDir.substring(3) :
                        end.getAbsolutePath() + "\\" + srcDir.substring(3);
//                System.out.println(destDir); 拿到对应的目录
                // 新建目录
                File newFile = new File(destDir);
                if (!newFile.exists()) {
                    newFile.mkdirs();
                }
            }*/
            fileCopy(file, end);
        }


    }
}
