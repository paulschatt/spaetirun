package spaetirun.team;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TeamService {

    @GetMapping("/teams")
    String getAllTeams() {
        return """
                    <!DOCTYPE html>
                    <html>
                    <body>
                    
                    <h1>Hello World</h1>
                    <p>Hier sollten alle teams stehem</p>
                    
                    </body>
                    </html>
                """;
    }

}
