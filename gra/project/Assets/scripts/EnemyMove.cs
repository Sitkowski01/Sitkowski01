using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using System;

public class EnemyMove : MonoBehaviour
{
    private float waitTime = 3.0f;
    private float waitTime2 = 12.0f;
    private float originalStepOffset;
    private CharacterController characterController;
    private Animator animator;
    private bool isWalking;
    private bool isTaunting;
    private float timer;
    // Start is called before the first frame update
    void Start()
    {
        animator = GetComponent<Animator>();
        characterController = GetComponent<CharacterController>();
        originalStepOffset = characterController.stepOffset;
        timer = 0.0f;
    }

    // Update is called once per frame
    void Update()
    {
        timer += Time.deltaTime;
        if (timer > waitTime2)
        {
            timer = timer - waitTime2;
            isTaunting = true;
        }
        else
        {
            animator.SetBool("isTaunting", false);

        }
        if(isTaunting)
        {
            isTaunting = false;
            animator.SetBool("isTaunting", true);
        }

    }
}
