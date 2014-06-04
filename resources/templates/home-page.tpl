<!DOCTYPE html>
<html lang="en">
    <head>
        {{>partials/head}}
    </head>
    <body>
        <div class="container">

            <h1 class="text-center">Ring/Compojure Demo Page.</h1>

            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque non pretium tortor. Aenean porta pretium odio, id accumsan lorem ultricies posuere. Suspendisse sed laoreet augue, porta ullamcorper sem. Mauris vitae tellus viverra, tincidunt lacus sit amet, blandit arcu. Aliquam risus dolor, vulputate quis varius at, luctus vel ligula. Pellentesque quam orci, tristique nec tempus quis, luctus in arcu. Morbi ac turpis fermentum, commodo augue quis, convallis metus. Donec lacus ipsum, suscipit sed aliquet nec, imperdiet at massa. Proin sit amet malesuada dui, sit amet condimentum magna. Fusce viverra non tellus et congue.</p>

            <p>Current time: <strong>{{time}}</strong></p>

            {{>partials/footer}}

        </div>

        {{>partials/scripts}}
    </body>
</html>