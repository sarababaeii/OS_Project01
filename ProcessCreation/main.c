//
//  main.c
//  ProcessCreation
//
//  Created by Sara Babaei on 5/27/22.
//

#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main(int argc, const char * argv[]) {
    pid_t pid;
    pid = fork();
    
    if (pid < 0) { // error occured
        fprintf(stderr, "fork Failed\n");
        return 1;
    }
    else if (pid == 0) { // child process
        execlp("pwd", "pwd", NULL);
    }
    else { // parent process
        // parent will wait for the child to complete
        wait(NULL);
        printf("Child Complete\n");
    }
    return 0;
}
