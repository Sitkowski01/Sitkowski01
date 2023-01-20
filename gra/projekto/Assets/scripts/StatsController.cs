using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;
using System.Threading;
using System.Threading.Tasks;
public class StatsController : MonoBehaviour
{
    public GameObject healthBar;
    public int maxHealth;
    public int currentHealth;
    private Animator animator;
    public PlayerInventory PlayerInventory;
    public Diamond Diamond;

  

    void Start()
    {
        animator = GetComponent<Animator>();
        currentHealth = maxHealth;
    }

    public void Heal(int amount){
        currentHealth += amount;
        if(currentHealth > maxHealth)
            currentHealth = maxHealth;

        UpdateHealthBar();
    }


 void ShowEndScreen()
 {
     SceneManager.LoadScene("EndScreen");
     Time.timeScale = 1;
 }

     
 
        public void Damage(int amount){
        currentHealth -= amount;
        if(currentHealth < 0 )
        {
            currentHealth = 0;
            animator.SetTrigger("Death");
            Invoke("ShowEndScreen", 2.0f);

        }
        UpdateHealthBar(); 
    }

    

    public void UpdateHealthBar(){
        healthBar.transform.localScale = new Vector3(
            currentHealth *1f / maxHealth * 1f,
            healthBar.transform.localScale.y,
            healthBar.transform.localScale.z
        );
    }

    
   
}
