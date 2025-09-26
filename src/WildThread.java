public class WildThread extends Thread
{
    @Override
    public void run()
    {
        try
        {
            Thread.sleep( 200 );
        }
        catch( InterruptedException e )
        {
            throw new RuntimeException( e );
        }
        System.out.println("Wild random Thread appears!");
    }
}
