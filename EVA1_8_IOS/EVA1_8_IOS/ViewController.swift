//
//  ViewController.swift
//  EVA1_8_IOS
//
//  Created by invitado on 08/02/19.
//  Copyright © 2019 Personal. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    
    @IBOutlet weak var lblMensa: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        lblMensa.text = "HELLO WORLD"
    }

    @IBAction func onClick(_ sender: Any) {
        lblMensa.text = "Evento desde botón"
    }
    
}

