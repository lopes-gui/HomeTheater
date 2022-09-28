/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometheatertestdrive;

/**
 *
 * @author Aluno
 */
public class HomeTheaterFacade {

    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public Amplifier getAmp() {
        return amp;
    }

    public void setAmp(Amplifier amp) {
        this.amp = amp;
    }

    public Tuner getTuner() {
        return tuner;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public DvdPlayer getDvd() {
        return dvd;
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
    }

    public CdPlayer getCd() {
        return cd;
    }

    public void setCd(CdPlayer cd) {
        this.cd = cd;
    }

    public Projector getProjector() {
        return projector;
    }

    public void setProjector(Projector projector) {
        this.projector = projector;
    }

    public TheaterLights getLights() {
        return lights;
    }

    public void setLights(TheaterLights lights) {
        this.lights = lights;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public PopcornPopper getPopper() {
        return popper;
    }

    public void setPopper(PopcornPopper popper) {
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie");
    

    popper.on ();

    popper.pop ();

    lights.dim (10);
    screen.down();

    projector.on ();

    projector.widescreenMode();

    amp.on ();

    amp.setDvd (dvd);

    amp.setSurroundSqund ();

    amp.setVolume (5);
    dvd.on ();

    dvd.play (movie);

    }
    
    
    public void endMovie() {
        System.out.println("shutting movie theater down ...");
        
    popper.off ();
    lights.on();
    screen.up ();
    projector.off (); 
    amp.off ();
    dvd.stop();
    dvd.eject ();
    dvd.off ();

        
    }
    
    
}
