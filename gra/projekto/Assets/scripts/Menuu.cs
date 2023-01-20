using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class Menuu : MonoBehaviour
{
    public void ZmienScene ()
    {
        SceneManager.LoadScene("SampleScene");
    }
}
