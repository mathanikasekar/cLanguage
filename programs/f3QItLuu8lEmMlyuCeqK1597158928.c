#include<stdio.h>
void mergeArray(int arr[] , int start , int mid , int end)
{
  int n1 , n2 , j , ind , i ;
  n1 = (mid-start)+1;
  n2 = end - mid ;
  int l[n1] , r[n2];
  for(i = 0 ; i < n1 ; i++)
     l[i] = arr[start+i];
  for(i = 0 ; i < n2 ; i++)
     r[i] = arr[mid+i+1];

  i = 0 ;
  j = 0 ;
  ind = start ;
  while(i < n1 && j < n2)
  {
    if(l[i] < r[j])
        arr[ind++] = l[i++];
    else
        arr[ind++] = r[j++];
  }
  while(i < n1)
      arr[ind++] = l[i++];
  while( j < n2)
      arr[ind++] = r[j++];

}
void mergeSort(int arr[] , int start , int end)
{

  if(start < end)
  {
    int mid ;
  mid = start + (end - start) / 2;
  mergeSort(arr , start , mid);
  mergeSort(arr , mid+1 , end);
  mergeArray(arr , start , mid , end);
  }
}
int main()
{

int N  , ind ;
  scanf("%d" , &N);

  int arr[N];
  for(ind = 0 ; ind < N ; ind++)
     scanf("%d" , &arr[ind]);

 // mergeArray(arr , 0 , N/2-1 , N-1);
 //mergeArray(arr , 4 , 5, 7);
  mergeSort(arr ,  0 , N-1);
  for(ind = 0 ; ind < N ; ind++)
     printf("%d " , arr[ind]);
  return 0 ;
}
