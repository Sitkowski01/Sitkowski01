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

public float deathScreenDelay = 3.0f;
void OnDeath()
 {
     // Pause the game for the specified delay time
     Time.timeScale = 0;
     Invoke("ShowEndScreen", deathScreenDelay);
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
            
            //OnDeath();
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
