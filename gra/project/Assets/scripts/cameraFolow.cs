using UnityEngine;

public class cameraFolow: MonoBehaviour
{
    public Transform target;
    public float followDistance = 10.0f;
    public float followHeight = 5.0f;
    public float followLerpSpeed = 5.0f;

    private void LateUpdate()
    {
        if (target == null)
        {
            return;
        }

        Vector3 targetPosition = target.position;
        targetPosition.y += followHeight;

        Vector3 direction = targetPosition - transform.position;
        direction.Normalize();

        Vector3 targetFollowPosition = targetPosition - direction * followDistance;

        transform.position = Vector3.Lerp(transform.position, targetFollowPosition, followLerpSpeed * Time.deltaTime);
        transform.LookAt(targetPosition);
    }
}