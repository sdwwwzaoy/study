#include <jni.h>
#include <stdio.h>
#include "NativeMethod.h" // 由 javah 自动生成的头文件

JNIEXPORT void JNICALL Java_com_example_jvm_11_1memory_NativeMethod_sayHello(JNIEnv *env, jobject obj) {
    printf("Hello from native method!\n");
}
