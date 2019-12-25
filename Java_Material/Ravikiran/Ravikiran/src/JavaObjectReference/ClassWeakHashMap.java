package JavaObjectReference;

import java.util.Map;
import java.util.WeakHashMap;
 
/*
You saw me use the reference queue class in the previous example. A ReferenceQueue instance 
can be supplied as an argument to SoftReference, WeakReference or PhantomReference. 
When an object is collected the reference instance itself will be enqueued to the 
supplied ReferenceQueue. This allows you to perform clean up operations on the object. 
This is useful if you are implementing any container classes that you want to contain a Soft, 
Weak or Phantom reference and some associated data because you can get notified via 
the ReferenceQueue which Reference was just collected.
*/


public class ClassWeakHashMap {
 
	/*
	 There is also a convience WeakHashMap that wraps all keys by a weak reference. 
	 Allowing you to easily store meta data against an object and have the map entry 
	 including the meta data removed and collected when the original object 
	 itself is unreachable.
	 */
	
	
    public static class Referred {
        protected void finalize() {
            System.out.println("Good bye cruel world");
        }
    }
 
    public static void collect() throws InterruptedException {
        System.out.println("Suggesting collection");
        System.gc();
        System.out.println("Sleeping");
        Thread.sleep(5000);
    }
 
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Creating weak references");
 
        // This is now a weak reference.
        // The object will be collected only if no strong references.
        Referred strong = new Referred();
        Map<Referred,String> metadata = new WeakHashMap<Referred,String>();
        metadata.put(strong, "WeakHashMap's make my world go around");
 
        // Attempt to claim a suggested reference.
        ClassWeakHashMap.collect();
        System.out.println("Still has metadata entry? " + (metadata.size() == 1));
        System.out.println("Removing reference");
        // The object may be collected.
        strong = null;
        ClassWeakHashMap.collect();
 
        System.out.println("Still has metadata entry? " + (metadata.size() == 1));
 
        System.out.println("Done");
    }
 
}
