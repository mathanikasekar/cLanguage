

#include<stdio.h>
void swap(int arr[] , int ind1 , int ind2)
{
  int temp ;
  temp = arr[ind1];
  arr[ind1] = arr[ind2];
  arr[ind2] = temp;
}
void maxHeapify(int arr[] , int N , int parent)
{

 int left , right ;
 left =  parent * 2 + 1 ;
 right = left + 1 ; //parent * 2 + 2 ;
 if( left >= N) return ; // leaf node
 if(right == N) // one child that is also been a left
 {
  if(arr[left] > arr[parent])
      swap(arr , left , parent);

   return ;
 }
 if(arr[left] > arr[parent] || arr[right]> arr[parent]) // 2child
 {
   if( arr[left] > arr[right])
   {
     swap(arr , left , parent);
     maxHeapify(arr , N , left);
   }
   else
   {
     swap(arr , right , parent);
     maxHeapify(arr , N , right);
   }
 }

}
void heapSort(int arr[] , int N)
{
  int parent ;

  for(parent = N/2 -1 ; parent >= 0 ; parent--)
      maxHeapify(arr , N , parent);
}
int main()
{
  int itr , K , N , ind;
  scanf("%d %d" , &N , &K);

  int arr[N];
  for(ind = 0 ; ind < N ; ind++)
      scanf("%d" , &arr[ind]);

  heapSort(arr , N);

  for(itr = 1 ; itr <= K ; itr++ , printf("\n"))
  {
    arr[0] = arr[0]/2;
  for(ind = 0 ; ind < N ; ind++)
      printf("%d " , arr[ind]);
   maxHeapify(arr , N , 0);
  }

  return 0;
}
