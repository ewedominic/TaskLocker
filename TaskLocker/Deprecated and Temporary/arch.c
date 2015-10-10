#include "jni.h"
#include <stdio.h>
#include "pl_test_tasklocker_TaskLocker.h"

JNIEXPORT jint JNICALL Java_pl_test_tasklocker_TaskLocker_WindowsArch (JNIEnv * env, jobject jobj){
    printf("C test");
}
