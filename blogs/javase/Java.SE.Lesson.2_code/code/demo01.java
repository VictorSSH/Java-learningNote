System.out.println("????----------");
        int i = 0;
        int j = 0;
        try{
            /**???????**/
            String star1=a[0];
            /**???????**/
            String star2=a[1];
            /**??????????????**/
            i=Integer.parseInt(star1);
            /**??????????????**/
            j=Integer.parseInt(star2);
            /**???????**/
            int tmp = i/j;
            /**????????**/
            System.out.println("??????????"+tmp);
            System.out.println("------------");
            /**??????**/
        }catch(ArithmeticException e){
            System.out.println("????"+e);
            /**????????**/
        }catch (NumberFormatException e){
            System.out.println("??????"+ e);
            /**????????**/
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("??????"+e);
            /**??????**/
        }catch (Exception e){
            System.out.println("????"+e);
        }

        System.out.println("????------");
    }