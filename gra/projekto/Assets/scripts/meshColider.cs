using UnityEngine;

public class meshColider : MonoBehaviour
{
    public GameObject model; // the model GameObject to create a custom collider for

    void Start()
    {
        // create a mesh collider for the model
        MeshCollider collider = model.AddComponent<MeshCollider>();

        // get the mesh of the model
        Mesh mesh = model.GetComponent<MeshFilter>().mesh;

        // set the mesh of the collider to the mesh of the model
        collider.sharedMesh = mesh;
    }
}