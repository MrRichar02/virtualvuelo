{
  description = "devshell with jdk11";

  inputs = {
    nixpkgs.url = "github:nixos/nixpkgs?ref=nixos-unstable";
  };

  outputs = { self, nixpkgs }: 
    let
      system = "x86_64-linux";
      pkgs = nixpkgs.legacyPackages.${system};
    in
      {

      devShells.${system}.default = pkgs.mkShell {

        packages = with pkgs; [
          maven
          jdk11
        ];

        shellHook = ''
          export SHELL="/run/current-system/sw/bin/bash"
        '';
      };
    };
}

