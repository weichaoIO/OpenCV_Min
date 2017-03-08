#include <jni.h>
#include <string>

#include <opencv2/highgui/highgui.hpp>

extern "C"
JNIEXPORT jstring JNICALL
Java_io_weichao_opencv_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
